# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS-Industrial support for ABB manipulators (metapackage)."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD & Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "abb-driver abb-irb2400-moveit-config abb-irb2400-moveit-plugins abb-irb2400-support abb-irb4400-support abb-irb5400-support abb-irb6600-support abb-irb6640-moveit-config abb-irb6640-support abb-resources catkin-native"
SRC_URI = "https://github.com/ros-industrial-release/${PN}-release/archive/release/kinetic/${PN}/1.3.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b10bc01fdd41da5a50484a074237ff4d"
SRC_URI[sha256sum] = "e832daf4d35129929c51a95a4aff60576b130161c32ecaf63a4e55d7f4044c0b"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-1.3.0-1"

inherit catkin
