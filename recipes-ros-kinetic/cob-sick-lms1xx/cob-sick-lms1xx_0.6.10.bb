# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package published a laser scan message out of a Sick LMS1xx laser scanner. "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=f98baea2aacd7005a8c478da0abd4ded"

DEPENDS = "boost catkin-native diagnostic-msgs roscpp sensor-msgs"
SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/kinetic/cob_sick_lms1xx/0.6.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "07461eed7fd8acd0111ea646a1d22315"
SRC_URI[sha256sum] = "e4f320af5b9c09edc886b9698617d84abe20c8d7156857988e7ff0459d85be14"
S = "${WORKDIR}/cob_driver-release-release-kinetic-cob_sick_lms1xx-0.6.10-0"

inherit catkin
