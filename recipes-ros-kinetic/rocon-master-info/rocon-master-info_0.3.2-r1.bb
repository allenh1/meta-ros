# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Publish master information - name, description, icon."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-catkin-pkg-native python-rospkg rocon-bubble-icons rocon-console rocon-icons rocon-python-comms rocon-python-utils rocon-std-msgs rocon-uri rospy"
SRC_URI = "https://github.com/yujinrobot-release/rocon_tools-release/archive/release/kinetic/rocon_master_info/0.3.2-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "de96bb632b58a371fafdd9f130307bce"
SRC_URI[sha256sum] = "72cd378db75a699c55e7915f8e0d65dae7cc3eb4f40ef100fc1c1a96646927c7"
S = "${WORKDIR}/rocon_tools-release-release-kinetic-rocon_master_info-0.3.2-1"

inherit catkin
