# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "cob_relayboard"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=5;endline=5;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-msgs roscpp rospy std-msgs"
SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/kinetic/cob_relayboard/0.6.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "de502f9f36677c5d96cfcd50f2ac6f69"
SRC_URI[sha256sum] = "ea5279a9bf0096f1fd8836d9c00f1414ad179c47fb5da17ea6b9d6ab937dc24b"
S = "${WORKDIR}/cob_driver-release-release-kinetic-cob_relayboard-0.6.10-0"

inherit catkin
