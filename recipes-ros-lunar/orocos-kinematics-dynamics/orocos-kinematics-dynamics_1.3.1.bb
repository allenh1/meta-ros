# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package depends on a recent version of the Kinematics and Dynamics     Libr"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native orocos-kdl python-orocos-kdl"
SRC_URI = "https://github.com/smits/orocos-kdl-release/archive/release/lunar/orocos_kinematics_dynamics/1.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "010022a040b7dd12e004f49b1fe8031d"
SRC_URI[sha256sum] = "f81a1a179b95e0fedccb5a554b1dd9ee818126c0b31f8a98ec4199562c9c85c3"
S = "${WORKDIR}/orocos-kdl-release-release-lunar-orocos_kinematics_dynamics-1.3.1-0"

inherit catkin
