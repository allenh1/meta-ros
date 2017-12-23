# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A bond allows two processes, A and B, to know when the other has     terminated,"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "bond bondcpp bondpy catkin-native smclib"
SRC_URI = "https://github.com/ros-gbp/bond_core-release/archive/release/kinetic/bond_core/1.8.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3be4975b35f1b1af63604327cfb6362c"
SRC_URI[sha256sum] = "87db6e9e21548f408159cd153a9d2fce3f36bbc07a994cd85a329ebd39bd2354"
S = "${WORKDIR}/bond_core-release-release-kinetic-bond_core-1.8.1-0"

inherit catkin
