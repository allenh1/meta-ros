# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The cob_phidget_power_state package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-msgs cob-phidgets rospy"
SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/kinetic/cob_phidget_power_state/0.6.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6437ac61fb4a75f820aef959e08fa839"
SRC_URI[sha256sum] = "8dd722257c8b95185a32b058801a3d9e67997a2e1122647815f083b082b8ddf8"
S = "${WORKDIR}/cob_driver-release-release-kinetic-cob_phidget_power_state-0.6.10-0"

inherit catkin
