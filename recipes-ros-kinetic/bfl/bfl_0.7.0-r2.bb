# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains a recent version of the Bayesian Filtering   Library (BFL)"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "boost catkin-native cmake cppunit"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/kinetic/${PN}/0.7.0-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e00f4ae5e62aab3925ea8092a06564eb"
SRC_URI[sha256sum] = "54d9c8ae3cd477fa0a413e2100233e5f450760df4ad7dd8f63723889d913cea6"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.7.0-2"

inherit catkin
