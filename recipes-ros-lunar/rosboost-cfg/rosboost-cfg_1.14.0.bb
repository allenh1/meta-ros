# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Contains scripts used by the rosboost-cfg tool for determining cflags/lflags/etc"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-empy-native"
SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/lunar/rosboost_cfg/1.14.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3b739cdfbde507a1b8085184fbf5ee0c"
SRC_URI[sha256sum] = "b67ef970c65197cb75886376aff1085eff089c83163901aa7c2598944f5fe77b"
S = "${WORKDIR}/ros-release-release-lunar-rosboost_cfg-1.14.0-0"

inherit catkin
