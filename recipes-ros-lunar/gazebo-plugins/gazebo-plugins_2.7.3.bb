# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Robot-independent Gazebo plugins for sensors, motors and dynamic reconfigurable "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=f7d4e3a22e6490b133f4eb99348a8124"

DEPENDS = "angles camera-info-manager catkin-native cv-bridge diagnostic-updater dynamic-reconfigure gazebo-dev gazebo-msgs geometry-msgs image-transport message-generation message-runtime nav-msgs nodelet polled-camera rosconsole roscpp rosgraph-msgs rospy sensor-msgs std-msgs std-srvs tf tf2-ros trajectory-msgs urdf"
SRC_URI = "https://github.com/ros-gbp/gazebo_ros_pkgs-release/archive/release/lunar/gazebo_plugins/2.7.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "324c12e960d5e446414efe255e8b6aa4"
SRC_URI[sha256sum] = "c33ef47c379218e6a9f05691aca9137230ecebe43261863a0731a76252ecbb0d"
S = "${WORKDIR}/gazebo_ros_pkgs-release-release-lunar-gazebo_plugins-2.7.3-0"

inherit catkin
