# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains a C++ parser for the Unified Robot Description
    Format "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin cmake_modules liburdfdom-dev liburdfdom-headers-dev pluginlib rosconsole_bridge roscpp rostest urdf_parser_plugin"
SRC_URI = "https://github.com/ros-gbp/robot_model-release/archive/release/lunar/urdf/1.12.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3b8239ff8b2550abfcbce4bb85c52805"
SRC_URI[sha256sum] = "daf1e720eb332684c7c6e5ef0fbee8f748fe1175c8db22afde948b5dcd9ef375"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
