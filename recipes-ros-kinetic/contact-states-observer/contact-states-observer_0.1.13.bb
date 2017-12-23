# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The contact_states_observer package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation roseus std-msgs"
SRC_URI = "https://github.com/tork-a/jsk_control-release/archive/release/kinetic/contact_states_observer/0.1.13-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7783515a5df0ae8b05a70038865800f0"
SRC_URI[sha256sum] = "fdab59bebce630f089821725a80fad36684e7573d9921a3840471069f26720e5"
S = "${WORKDIR}/jsk_control-release-release-kinetic-contact_states_observer-0.1.13-0"

inherit catkin
