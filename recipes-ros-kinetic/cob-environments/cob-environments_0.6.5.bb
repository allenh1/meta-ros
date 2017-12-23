# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This stack holds packages for IPA default environment configuration."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-default-env-config"
SRC_URI = "https://github.com/ipa320/cob_environments-release/archive/release/kinetic/cob_environments/0.6.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "00d979c365803e9b1dae43150d639dd1"
SRC_URI[sha256sum] = "5edd1a9cf42b8640672514ce54435447b94b87137e4fcf2f3a512b284126f2f2"
S = "${WORKDIR}/cob_environments-release-release-kinetic-cob_environments-0.6.5-0"

inherit catkin
