# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The Kinematics and Dynamics Library (KDL) defines a tree structure    to represe"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules orocos-kdl rosconsole roscpp rostest urdf"
SRC_URI = "https://github.com/ros-gbp/kdl_parser-release/archive/release/kinetic/kdl_parser/1.12.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d7492612c5f308a3ebe9562f63024d79"
SRC_URI[sha256sum] = "66649ba2cbbcc1e40be55cef4926380618c1b0a26a383b6e3b2de21ecfb24658"
S = "${WORKDIR}/kdl_parser-release-release-kinetic-kdl_parser-1.12.10-0"

inherit catkin
