# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains ros_control based robot controller for PANASONIC MINAS Eth"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-2 & BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=fe8b75cf0aba647401e1038bcd69ee74"

DEPENDS = "catkin-native controller-manager diagnostic-updater ethercat-manager hardware-interface joint-limits-interface sensor-msgs soem libtinyxml trajectory-msgs transmission-interface"
SRC_URI = "https://github.com/tork-a/minas-release/archive/release/kinetic/minas_control/1.0.7-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "da30c164b5d27c2667b846ee4f3cdb73"
SRC_URI[sha256sum] = "366e637681ea1e7a4922530ced204101952f07266ef96e85dac80efadc29678c"
S = "${WORKDIR}/minas-release-release-kinetic-minas_control-1.0.7-1"

inherit catkin
