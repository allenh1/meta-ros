# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "publish end effector's force, which is estmated from joint torque value"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs kdl-parser sensor-msgs tf-conversions urdf"
SRC_URI = "https://github.com/tork-a/jsk_common-release/archive/release/kinetic/virtual_force_publisher/2.2.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "64352f065af7726ccb5b2fdd1a482d9c"
SRC_URI[sha256sum] = "b48872a5a1daafa5e634d797fcea04f37e9df79ea6940200782b5e8a92508c05"
S = "${WORKDIR}/jsk_common-release-release-kinetic-virtual_force_publisher-2.2.5-0"

inherit catkin
