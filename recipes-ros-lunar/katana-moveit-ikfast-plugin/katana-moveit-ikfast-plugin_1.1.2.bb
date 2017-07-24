# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The katana_moveit_ikfast_plugin package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "python-empy-native liblapack-dev moveit-core pluginlib roscpp tf-conversions"
SRC_URI = "https://github.com/uos-gbp/katana_driver-release/archive/release/lunar/katana_moveit_ikfast_plugin/1.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "108de0a9942ae8490b5446d5c32c017a"
SRC_URI[sha256sum] = "35b8af4fcfc0c1c8e50f9300c9cc1ddfa78584a2c04ff06392c6e70a1ac83be1"
S = "${WORKDIR}/katana_driver-release-release-lunar-katana_moveit_ikfast_plugin-1.1.2-0"

inherit catkin
