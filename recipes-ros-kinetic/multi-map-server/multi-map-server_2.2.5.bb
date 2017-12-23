# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "multi_map_server provides the"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native jsk-tools map-server nav-msgs python-imaging python-pyyaml rosconsole roscpp rosmake rospy sdl-image tf yaml-cpp"
SRC_URI = "https://github.com/tork-a/jsk_common-release/archive/release/kinetic/multi_map_server/2.2.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cf0b27ad1567e381e10af1c4ba6ec7da"
SRC_URI[sha256sum] = "eccf8adf2a50c88bea22eb58881e414009a4f4c04f13192188dafb7492855079"
S = "${WORKDIR}/jsk_common-release-release-kinetic-multi_map_server-2.2.5-0"

inherit catkin
