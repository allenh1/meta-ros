# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rosconsole_bridge is a package used in conjunction with console_bridge and rosco"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=ab6325b8f99aba083b33fd6054823ac3"

DEPENDS = "catkin libconsole-bridge-dev rosconsole"
SRC_URI = "https://github.com/ros-gbp/rosconsole_bridge-release/archive/release/lunar/rosconsole_bridge/0.4.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "390f1c5b30b6f7d6d0593200dfb45630"
SRC_URI[sha256sum] = "9aa0c353261d0c18be61ec6e3212165d3b010c1f5109e5f2f9c841680b4ac96b"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
