# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Library for capturing data from the Intel(R) RealSense(TM) F200, SR300, R200, LR"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=22;endline=22;md5=e8978a5103d23266fc6f8ec03dc9eb16"

DEPENDS = "catkin-native dkms libssl-dev libusb-1.0-dev linux-headers-generic pkgconfig"
SRC_URI = "https://github.com/intel-ros/${PN}-release/archive/release/kinetic/${PN}/1.12.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b94937749d084b1ed22547b596215423"
SRC_URI[sha256sum] = "5a25f39bc13940211cec4fae8d377da4117fa07033d73226a588bce4a9e34129"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-1.12.1-0"

inherit catkin
