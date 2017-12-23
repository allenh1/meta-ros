# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides zeroconf services on avahi for ros systems.      This is a c++ implemen"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "avahi-daemon catkin-native libavahi-client-dev libavahi-core-dev rosconsole roscpp zeroconf-msgs"
SRC_URI = "https://github.com/yujinrobot-release/zeroconf_avahi_suite-release/archive/release/kinetic/zeroconf_avahi/0.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8f96e83be9762c110494dcddf3b37a13"
SRC_URI[sha256sum] = "bf23ee2938a77f7ecbee57ea8f76a542ef82154d831aed726f8120b23f4b2a0b"
S = "${WORKDIR}/zeroconf_avahi_suite-release-release-kinetic-zeroconf_avahi-0.2.3-0"

inherit catkin
