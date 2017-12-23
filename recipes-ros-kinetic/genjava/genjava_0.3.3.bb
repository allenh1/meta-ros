# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Java ROS message and service generators."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native genmsg python-catkin-pkg-native python-rospkg rosjava-bootstrap rosjava-build-tools"
SRC_URI = "https://github.com/rosjava-release/${PN}-release/archive/release/kinetic/${PN}/0.3.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9d34ad6c189d23be996b529a70ef6fd4"
SRC_URI[sha256sum] = "59f7fa335f12c167b921522772a1d3d73e48935947bfb125a5c981081439e726"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.3.3-0"

inherit catkin
