# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Default configuration of the different robots supported by the Care-O-bot stacks"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-supported-robots roslaunch"
SRC_URI = "https://github.com/ipa320/cob_robots-release/archive/release/kinetic/cob_default_robot_config/0.6.7-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "31428256bc82c062bd7720f452a18e5a"
SRC_URI[sha256sum] = "86a56c9bb859050fd41ffa2784fcea224f6c9c7411dcc6f8a2a1adab3a9ea65f"
S = "${WORKDIR}/cob_robots-release-release-kinetic-cob_default_robot_config-0.6.7-1"

inherit catkin
