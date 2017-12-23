# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The cob_common stack hosts common packages that are used within the Care-O-bot r"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=5;endline=5;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-description cob-msgs cob-srvs raw-description"
SRC_URI = "https://github.com/ipa320/cob_common-release/archive/release/kinetic/cob_common/0.6.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1eb0eb003406968a431c67813fbe4362"
SRC_URI[sha256sum] = "5486973515840669ac7cfcf8050a0bc73966e999515b12bbc9c46c9d018d9d85"
S = "${WORKDIR}/cob_common-release-release-kinetic-cob_common-0.6.7-0"

inherit catkin
