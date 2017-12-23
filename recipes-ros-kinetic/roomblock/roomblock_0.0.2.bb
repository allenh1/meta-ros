# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The roomblock meta package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roomblock-bringup roomblock-description roomblock-mapping roomblock-navigation"
SRC_URI = "https://github.com/tork-a/${PN}-release/archive/release/kinetic/${PN}/0.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "770f4e82e22d02b29140165f92efbfd8"
SRC_URI[sha256sum] = "986da8708f4ba12aa333ff28c245ffa999806f6ee68092298ccba12e02a84d93"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.0.2-0"

inherit catkin
