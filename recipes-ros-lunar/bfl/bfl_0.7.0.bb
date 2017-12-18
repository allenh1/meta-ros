# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains a recent version of the Bayesian Filtering   Library (BFL)"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native catkin cmake cppunit ros"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/lunar/${PN}/0.7.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "844982693c5cdc156b5d0a490baea419"
SRC_URI[sha256sum] = "02930745a24727863d41f471795e56c9ec24ef4303430d8b7e92a42cdbddfa0b"
S = "${WORKDIR}/${PN}-release-release-lunar-${PN}-0.7.0-0"

inherit catkin
