# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The katana_moveit_ikfast_plugin package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSDApache"
LIC_FILES_CHKSUM = "file://package.xml;beginline=;endline=;md5="

DEPENDS = "catkin liblapack-dev moveit_core pluginlib roscpp tf_conversions"
SRC_URI = "https://github.com/uos-gbp/katana_driver-release/archive/release/lunar/katana_moveit_ikfast_plugin/1.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "108de0a9942ae8490b5446d5c32c017a"
SRC_URI[sha256sum] = "35b8af4fcfc0c1c8e50f9300c9cc1ddfa78584a2c04ff06392c6e70a1ac83be1"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
