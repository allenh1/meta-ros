# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Discover the running ROS Masters in local network. The       discovering is done"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "avahi-daemon catkin-native multimaster-msgs-fkie python-avahi rosgraph roslib rospy std-srvs"
SRC_URI = "https://github.com/fkie-release/multimaster_fkie-release/archive/release/kinetic/master_discovery_fkie/0.7.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "92d501fe01b5ebaec578083075fff726"
SRC_URI[sha256sum] = "827fcec31cc7864df609919ca37af494cfa864ac6e23972a47b8c8b638933dbc"
S = "${WORKDIR}/multimaster_fkie-release-release-kinetic-master_discovery_fkie-0.7.7-0"

inherit catkin
