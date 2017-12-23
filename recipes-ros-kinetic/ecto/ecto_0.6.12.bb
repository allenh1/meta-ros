# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Ecto is a hybrid C++/Python development framework for constructing and maintaini"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native python xdot"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/kinetic/${PN}/0.6.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b74d60d4bc2b9342d1c163decccd24aa"
SRC_URI[sha256sum] = "6e7ed6ec4a59b7a34d2a936c291a7c115e930ffaacd8f44aeef02140ac4dbb9a"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.6.12-0"

inherit catkin
