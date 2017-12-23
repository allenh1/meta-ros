# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The Kinematics and Dynamics Library (KDL) defines a tree structure    to represe"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native orocos-kdl python-catkin-pkg-native python-orocos-kdl rostest urdf urdfdom-py"
SRC_URI = "https://github.com/ros-gbp/kdl_parser-release/archive/release/kinetic/kdl_parser_py/1.12.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d1238aa350109ecebb9750edca32088e"
SRC_URI[sha256sum] = "32d2a9fd445cf9b06678df2ececb21ee387a2ea84536ede1fde170934dc41028"
S = "${WORKDIR}/kdl_parser-release-release-kinetic-kdl_parser_py-1.12.10-0"

inherit catkin
