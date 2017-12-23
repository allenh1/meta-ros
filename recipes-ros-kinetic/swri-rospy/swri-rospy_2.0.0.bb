# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides added functionaliy on top of rospy, including a   single-t"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rospy std-msgs std-srvs"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/kinetic/swri_rospy/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "39d114a89f1ad37bfea35e5cc68a85b5"
SRC_URI[sha256sum] = "9ebc1a2f0460951b13169795c811cac2975ca682145877e091d65b4ea99471f0"
S = "${WORKDIR}/marti_common-release-release-kinetic-swri_rospy-2.0.0-0"

inherit catkin
