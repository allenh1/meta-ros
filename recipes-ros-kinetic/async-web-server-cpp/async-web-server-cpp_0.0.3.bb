# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Asynchronous Web/WebSocket Server in C++"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native libssl-dev python-websocket"
SRC_URI = "https://github.com/gt-rail-release/async_web_server_cpp-release/archive/release/kinetic/async_web_server_cpp/0.0.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "adb7e1ad737537c10d27bf374b258d3c"
SRC_URI[sha256sum] = "32d6fc632c8c80656899d314fae6ca57e3db01312e82b3735c9ee50bb3f996e7"
S = "${WORKDIR}/async_web_server_cpp-release-release-kinetic-async_web_server_cpp-0.0.3-0"

inherit catkin
