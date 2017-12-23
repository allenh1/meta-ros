# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The cob_scan_unifier package holds code to unify two or more laser-scans to one "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native laser-geometry roscpp sensor-msgs tf"
SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/kinetic/cob_scan_unifier/0.6.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c0105111b30ab8064e5b852408149715"
SRC_URI[sha256sum] = "0a35583d21207e7c69d99ac2bfc0d0b3b6628bdba93acdce0265aef1ccd41314"
S = "${WORKDIR}/cob_driver-release-release-kinetic-cob_scan_unifier-0.6.10-0"

inherit catkin
