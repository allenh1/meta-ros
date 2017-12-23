# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides an interface for operating the schunk dexterous hand (SDH)"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "actionlib boost catkin-native cob-srvs control-msgs diagnostic-msgs dpkg libntcan libpcan libusb-dev message-generation message-runtime roscpp roslint sensor-msgs std-msgs std-srvs trajectory-msgs urdf"
SRC_URI = "https://github.com/ipa320/schunk_modular_robotics-release/archive/release/kinetic/schunk_sdh/0.6.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a86fedd0067d53114ad1ed1ca1ebda99"
SRC_URI[sha256sum] = "8d546e8716abdf44f45b119fbb65863009f9f3365b784a2776a946f317eebbfd"
S = "${WORKDIR}/schunk_modular_robotics-release-release-kinetic-schunk_sdh-0.6.9-0"

inherit catkin
