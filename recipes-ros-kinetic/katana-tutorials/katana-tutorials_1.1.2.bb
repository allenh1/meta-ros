# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains test and demo programs for the katana_driver stack."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "actionlib catkin-native control-msgs roscpp sensor-msgs trajectory-msgs"
SRC_URI = "https://github.com/uos-gbp/katana_driver-release/archive/release/kinetic/katana_tutorials/1.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bc512b1b40e70ed135f9dc99861a711a"
SRC_URI[sha256sum] = "c8d8721c72639700a61d81e2c9ef2f5b64a7d2cbacc805786560203b139c2ca5"
S = "${WORKDIR}/katana_driver-release-release-kinetic-katana_tutorials-1.1.2-0"

inherit catkin
