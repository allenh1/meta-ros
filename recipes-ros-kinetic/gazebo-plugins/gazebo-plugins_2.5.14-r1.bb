# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Robot-independent Gazebo plugins for sensors, motors and dynamic reconfigurable "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=f7d4e3a22e6490b133f4eb99348a8124"

DEPENDS = "angles camera-info-manager catkin-native cv-bridge diagnostic-updater dynamic-reconfigure gazebo-dev gazebo-msgs geometry-msgs image-transport message-generation message-runtime nav-msgs nodelet polled-camera rosconsole roscpp rosgraph-msgs rospy sensor-msgs std-msgs std-srvs tf tf2-ros trajectory-msgs urdf"
SRC_URI = "https://github.com/ros-gbp/gazebo_ros_pkgs-release/archive/release/kinetic/gazebo_plugins/2.5.14-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "db8221810fdd8a0036f5c90d8c963db4"
SRC_URI[sha256sum] = "4a36e2f8ddfde9671c23fdaf9d899224483f24dd05d66e5210d879bbee6ba22a"
S = "${WORKDIR}/gazebo_ros_pkgs-release-release-kinetic-gazebo_plugins-2.5.14-1"

inherit catkin
