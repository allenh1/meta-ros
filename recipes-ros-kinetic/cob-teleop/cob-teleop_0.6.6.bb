# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Teleop node"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "actionlib catkin-native cob-light cob-script-server cob-sound geometry-msgs roscpp sensor-msgs std-msgs std-srvs"
SRC_URI = "https://github.com/ipa320/cob_command_tools-release/archive/release/kinetic/cob_teleop/0.6.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5b9091853f3d42ff4b8156244f640f55"
SRC_URI[sha256sum] = "2d2f179c49b45f716dadd39c6f1883429b5d1f8dbe7783802da519aead56624b"
S = "${WORKDIR}/cob_command_tools-release-release-kinetic-cob_teleop-0.6.6-0"

inherit catkin
