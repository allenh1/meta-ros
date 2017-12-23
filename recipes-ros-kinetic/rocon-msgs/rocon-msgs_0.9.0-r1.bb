# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Communication types (msgs/srvs/actions) for robotics in concert (aka multimaster"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native concert-msgs concert-service-msgs gateway-msgs rocon-app-manager-msgs rocon-device-msgs rocon-interaction-msgs rocon-service-pair-msgs rocon-std-msgs rocon-tutorial-msgs scheduler-msgs"
SRC_URI = "https://github.com/yujinrobot-release/rocon_msgs-release/archive/release/kinetic/rocon_msgs/0.9.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "933de921b0eaa04c92008f06eee642c2"
SRC_URI[sha256sum] = "efd0a5a7038dbd2faa70183e0db06f9f5e3aecc750bb7849d655d1adae956c50"
S = "${WORKDIR}/rocon_msgs-release-release-kinetic-rocon_msgs-0.9.0-1"

inherit catkin
