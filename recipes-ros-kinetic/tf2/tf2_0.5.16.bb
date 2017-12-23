# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "tf2 is the second generation of the transform library, which lets     the user k"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs console-bridge rostime tf2-msgs"
SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/kinetic/${PN}/0.5.16-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c926dceb85aa9879583f6fe17ac03372"
SRC_URI[sha256sum] = "b70c705a838c3cdabbb6570691a519028e5674d6fb9322a61a50d55ee9e58e1f"
S = "${WORKDIR}/geometry2-release-release-kinetic-${PN}-0.5.16-0"

inherit catkin
