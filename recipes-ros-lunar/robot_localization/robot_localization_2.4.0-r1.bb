# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides nonlinear state estimation through sensor fusion of an abritrary number"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=;endline=;md5="

DEPENDS = "catkin cmake_modules diagnostic_msgs diagnostic_updater eigen geographic_msgs geometry_msgs message_filters message_generation message_runtime nav_msgs python-catkin-pkg roscpp roslint sensor_msgs std_msgs tf2 tf2_geometry_msgs tf2_ros xmlrpcpp"
SRC_URI = "https://github.com/cra-ros-pkg/robot_localization-release/archive/release/lunar/robot_localization/2.4.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "367cacc7deac104844d5e6f821a0a959"
SRC_URI[sha256sum] = "ce8d593d3e04663e92cf713f6bf2c908bb7305109a3aef90fe4d350a40388d0e"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
