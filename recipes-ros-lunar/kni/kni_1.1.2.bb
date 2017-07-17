# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides the third-party KNI (Katana Native Interface) library for "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=;endline=;md5="

DEPENDS = "boost catkin"
SRC_URI = "https://github.com/uos-gbp/katana_driver-release/archive/release/lunar/kni/1.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bfea6347a7933ac463750af29d5e1413"
SRC_URI[sha256sum] = "f121ace6391d8c993c39817db69061f4ba2a824fd41b5b3b7101ce9840987465"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
