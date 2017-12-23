# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package implements the Care-O-bot mimic"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "actionlib actionlib-msgs boost catkin-native libvlc-dev message-generation message-runtime roscpp roslib vlc"
SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/kinetic/cob_mimic/0.6.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8c14ef649b076e0403cf5a720b923816"
SRC_URI[sha256sum] = "d7145b477051b4a833f32556c9092b653d278fcbebc33cdeb80cc912adb6f079"
S = "${WORKDIR}/cob_driver-release-release-kinetic-cob_mimic-0.6.10-0"

inherit catkin
