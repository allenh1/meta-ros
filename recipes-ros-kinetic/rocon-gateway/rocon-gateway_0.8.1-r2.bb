# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A hub acts as a shared key-value store for multiple ros      systems (primarily "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native gateway-msgs python-crypto rocon-console rocon-gateway-utils rocon-hub-client rocon-python-comms rocon-python-redis rocon-python-utils rocon-python-wifi rosgraph roslib roslint rosparam rospy rosservice rostopic std-srvs zeroconf-avahi zeroconf-msgs"
SRC_URI = "https://github.com/yujinrobot-release/rocon_multimaster-release/archive/release/kinetic/rocon_gateway/0.8.1-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0c4e90b7a7411befdf5acc475bc6c4ec"
SRC_URI[sha256sum] = "916a1c92cf282b8333b9d92c6919e6bdcc8cb428fb1a1235d436a5d9815fadc8"
S = "${WORKDIR}/rocon_multimaster-release-release-kinetic-rocon_gateway-0.8.1-2"

inherit catkin
