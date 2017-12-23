# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package implements a sound play module using text2wave and aplay through py"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "actionlib actionlib-msgs alsa-oss catkin-native cob-srvs diagnostic-msgs libvlc-dev message-generation message-runtime roscpp rospy std-msgs std-srvs visualization-msgs vlc"
SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/kinetic/cob_sound/0.6.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0cdb310bb76f854ec08da2111465b9f9"
SRC_URI[sha256sum] = "d861fbf07014551f850035be12b23a71c3dfeae618cbe9737c937d45b5f0d682"
S = "${WORKDIR}/cob_driver-release-release-kinetic-cob_sound-0.6.10-0"

inherit catkin
