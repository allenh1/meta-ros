# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package wraps the libphidgets to use it as a ros dependency"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native libusb-dev"
SRC_URI = "https://github.com/ipa320/cob_extern-release/archive/release/kinetic/${PN}/0.6.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "56749df647894ae24a741293ae733b25"
SRC_URI[sha256sum] = "99aceb4e9710812e5d29841a6e9a75baae7a5b705c251ad003f188e168c19191"
S = "${WORKDIR}/cob_extern-release-release-kinetic-${PN}-0.6.11-0"

inherit catkin
