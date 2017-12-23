# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A metapackage which extends ros_base and includes ROS libaries for any robot har"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native control-msgs diagnostics executive-smach filters geometry robot-model robot-state-publisher ros-base xacro"
SRC_URI = "https://github.com/ros-gbp/metapackages-release/archive/release/kinetic/${PN}/1.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f883ea88126594f07836ea18e04c0ac9"
SRC_URI[sha256sum] = "2a65429b60df9bc310a28981ed747b19ce41c59c752775f553d71a84b261948a"
S = "${WORKDIR}/metapackages-release-release-kinetic-${PN}-1.3.1-0"

inherit catkin
