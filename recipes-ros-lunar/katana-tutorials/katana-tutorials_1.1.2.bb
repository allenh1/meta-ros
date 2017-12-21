# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains test and demo programs for the katana_driver stack."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "actionlib catkin-native control-msgs roscpp sensor-msgs trajectory-msgs"
SRC_URI = "https://github.com/uos-gbp/katana_driver-release/archive/release/lunar/katana_tutorials/1.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e2243f0532b1d5ec2f5a12cc9dd1a38d"
SRC_URI[sha256sum] = "8a7411411d3c7336b7ae62296493878fd5d638372a41902b0b7323e94498251e"
S = "${WORKDIR}/katana_driver-release-release-lunar-katana_tutorials-1.1.2-0"

inherit catkin
