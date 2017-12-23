# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A teleoperation node for the p2os_driver package."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs message-runtime sensor-msgs std-msgs tf"
SRC_URI = "https://github.com/allenh1/p2os-release/archive/release/kinetic/p2os_teleop/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b513d1b590db184f0501ff399c66a04e"
SRC_URI[sha256sum] = "ab335eef79180097bb377478917ae2f091b29fdb0c07812e51462f283558849d"
S = "${WORKDIR}/p2os-release-release-kinetic-p2os_teleop-2.1.0-0"

inherit catkin
