# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A hub acts as a shared key-value store for multiple ros      systems (primarily "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "avahi-daemon avahi-utils catkin-native redis-server rocon-console rocon-gateway rocon-python-comms rocon-python-redis rocon-semantic-version rosgraph std-srvs"
SRC_URI = "https://github.com/yujinrobot-release/rocon_multimaster-release/archive/release/kinetic/rocon_hub/0.8.1-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a3f5d6ad44fe892fb10a1cbf20ad8b4d"
SRC_URI[sha256sum] = "b8248f51ea37649c31da34ef01bd52fdcb393be5d64f46140a28b638cd861bdc"
S = "${WORKDIR}/rocon_multimaster-release-release-kinetic-rocon_hub-0.8.1-2"

inherit catkin
