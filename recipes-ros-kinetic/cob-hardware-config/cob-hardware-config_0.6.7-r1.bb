# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains configuration for each robot instance (e.g. cob4-X, raw3-X"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-calibration-data cob-description cob-omni-drive-controller cob-supported-robots diagnostic-aggregator joint-state-controller joint-trajectory-controller position-controllers raw-description roslaunch rostest schunk-description ur-description velocity-controllers xacro"
SRC_URI = "https://github.com/ipa320/cob_robots-release/archive/release/kinetic/cob_hardware_config/0.6.7-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "920df42b204c7c3542bcb46e9d0849ae"
SRC_URI[sha256sum] = "4393c64ea22b28f13e80e5b7fbd7b66805c9b930da14b2d60a33b997d0272f2c"
S = "${WORKDIR}/cob_robots-release-release-kinetic-cob_hardware_config-0.6.7-1"

inherit catkin
