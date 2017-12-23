# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Dock driving library for Kobuki. Users owning a docking station for Kobuki  	   "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-build ecl-geometry ecl-linear-algebra ecl-threads"
SRC_URI = "https://github.com/yujinrobot-release/kobuki_core-release/archive/release/kinetic/kobuki_dock_drive/0.7.8-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c9e609756a729427795a797a6e09f6f5"
SRC_URI[sha256sum] = "0eed1a5a5d853c1f96c4c2bd72d0cbaf3362a90c7bd4f8d11c7ec2109cf95520"
S = "${WORKDIR}/kobuki_core-release-release-kinetic-kobuki_dock_drive-0.7.8-1"

inherit catkin
