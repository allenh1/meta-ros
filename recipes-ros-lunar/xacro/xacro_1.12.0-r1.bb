# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Xacro (XML Macros)      Xacro is an XML macro language. With xacro, you can cons"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roslaunch roslint"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/lunar/${PN}/1.12.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a1ab44ac8131cbea3d80ed758fbcaeaa"
SRC_URI[sha256sum] = "c1d072e08302cf630e01cdabd24af1cc219b44987466078e005deff44876e255"
S = "${WORKDIR}/${PN}-release-release-lunar-${PN}-1.12.0-1"

inherit catkin
