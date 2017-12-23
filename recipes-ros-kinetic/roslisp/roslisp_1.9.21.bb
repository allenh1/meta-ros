# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Lisp client library for ROS, the Robot Operating System."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rosgraph-msgs roslang rospack sbcl std-srvs"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/kinetic/${PN}/1.9.21-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d00e4ea66d072e7ee757af55d5aaf971"
SRC_URI[sha256sum] = "7c1461d993cfbadccec208f5d806d10c146c9387ebfa15c5d8427b89261b92c7"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-1.9.21-0"

inherit catkin
