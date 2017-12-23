# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The lms1xx package contains a basic ROS driver for the SICK LMS1xx line of LIDAR"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native rosconsole-bridge roscpp roscpp-serialization sensor-msgs"
SRC_URI = "https://github.com/clearpath-gbp/${PN}-release/archive/release/kinetic/${PN}/0.1.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4a82a8cd72ab7622296b7ca99e115c96"
SRC_URI[sha256sum] = "c14f2f6e88a9f791ec177ad64ea3a5013d52642ace02c6011c6a490652660abc"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.1.6-0"

inherit catkin
