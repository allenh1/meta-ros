# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The Kinematics and Dynamics Library (KDL) defines a tree structure    to represe"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native orocos-kdl python-catkin-pkg-native python-orocos-kdl rostest urdf urdfdom-py"
SRC_URI = "https://github.com/ros-gbp/kdl_parser-release/archive/release/lunar/kdl_parser_py/1.12.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "27b76dce240fcc608ab5e978b1f3bcc6"
SRC_URI[sha256sum] = "4ded36fc779e90a96dadbc28800ba9bf0c858945fcd6fb33d717682c342ed25d"
S = "${WORKDIR}/kdl_parser-release-release-lunar-kdl_parser_py-1.12.10-0"

inherit catkin
